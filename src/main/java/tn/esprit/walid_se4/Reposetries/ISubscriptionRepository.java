package tn.esprit.walid_se4.Reposetries;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walid_se4.Entitis.Subscription;
import tn.esprit.walid_se4.Entitis.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription,Long> {
    Set<Subscription> findBytypeSub(TypeSubscription typeSub);
}
