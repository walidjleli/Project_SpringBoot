package tn.esprit.walid_se4.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.walid_se4.Entitis.Subscription;
import tn.esprit.walid_se4.Entitis.TypeSubscription;
import tn.esprit.walid_se4.Reposetries.ISubscriptionRepository;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service

public class SubscriptionServicesImpl implements ISubscriptionServices {private final ISubscriptionRepository subscriptionRepository;

    public Subscription addSubscription(Subscription subscription){
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return subscriptionRepository.findById(numSub).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAll() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void removeSubscription(Long numSub) {
        subscriptionRepository.deleteById(numSub);
    }

    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return subscriptionRepository.findBytypeSub(type);
    }

}
