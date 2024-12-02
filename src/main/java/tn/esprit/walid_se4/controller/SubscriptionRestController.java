package tn.esprit.walid_se4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walid_se4.Entitis.Subscription;
import tn.esprit.walid_se4.Entitis.TypeSubscription;
import tn.esprit.walid_se4.services.ISubscriptionServices;

import java.util.Set;

@RequiredArgsConstructor
@RequestMapping("subscription")
@RestController

public class SubscriptionRestController {
    private final ISubscriptionServices subscriptionServices;

    @PostMapping("/add")
    public Subscription saveSubscription(Subscription subscription){
        return subscriptionServices.addSubscription(subscription);
    }
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription){
        return subscriptionServices.updateSubscription(subscription);
    }
    @GetMapping("/get/{numSub}")
    public Subscription getSubscription(@PathVariable Long numSub){

        return subscriptionServices.retrieveSubscription(numSub);
    }
    @GetMapping("/byType {type}")
    public Set<Subscription> getSubscriptionsByType(@RequestParam TypeSubscription type) {
        return subscriptionServices.getSubscriptionByType(type);
    }


}
