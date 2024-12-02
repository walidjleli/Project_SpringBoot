package tn.esprit.walid_se4.services;

import tn.esprit.walid_se4.Entitis.Subscription;
import tn.esprit.walid_se4.Entitis.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionServices {
    Subscription addSubscription(Subscription subscription);

    Subscription updateSubscription(Subscription subscription);

    Subscription retrieveSubscription(Long numSub);

    List<Subscription> retrieveAll();

    void removeSubscription(Long numSub);

    public Set<Subscription> getSubscriptionByType(TypeSubscription type);
    }
