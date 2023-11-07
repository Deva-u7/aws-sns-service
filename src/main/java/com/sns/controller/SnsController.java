package com.sns.controller;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnsController {

    @Autowired
    AmazonSNSClient snsClient;
    private String TOPIC_ARN = "arn:aws:sns:ap-south-1:295245430654:DemoTopic";

    @GetMapping("/subscribe/{email}")
    public String subscribeToSNSTopic(@PathVariable("email") String email) {
        SubscribeRequest subscribeRequest =
                new SubscribeRequest(TOPIC_ARN,"email",email);

        snsClient.subscribe(subscribeRequest);
        return "Check your Email 🙏";
    }

    @GetMapping("/publish/{msg}")
    public String publishToTopic(@PathVariable("msg") String msg){
        PublishRequest publishRequest = new PublishRequest(TOPIC_ARN,msg,"Test Sns Trail" );
        snsClient.publish(publishRequest);
        return "Message Published!";
    }
}
