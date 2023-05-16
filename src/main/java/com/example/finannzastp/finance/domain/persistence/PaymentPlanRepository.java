package com.example.finannzastp.finance.domain.persistence;


import com.example.finannzastp.finance.domain.model.entity.PaymentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentPlanRepository extends JpaRepository<PaymentPlan, Long> {

}
