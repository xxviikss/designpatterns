package com.company;

public abstract class Search {
    private RentBehavior rentBehavior;
    private PurchaseBehavior purchaseBehavior;

    public Search(RentBehavior rentBehavior, PurchaseBehavior purchaseBehavior) {
        this.rentBehavior = rentBehavior;
        this.purchaseBehavior = purchaseBehavior;
    }



    public Search(DailyRent rentBehavior) {
        this.rentBehavior = rentBehavior;
    }

    public Search(LongTermRent rentBehavior) {
        this.rentBehavior = rentBehavior;
    }

    public Search(PurchaseOfNewBuilding purchaseBehavior) {
        this.purchaseBehavior = purchaseBehavior;
    }

    public void performRenting() {
        this.rentBehavior.renting();
    }

    public void performPurchasing() {
        this.purchaseBehavior.purchasing();
    }

    public abstract void display();

    public RentBehavior getRentBehavior() {
        return rentBehavior;
    }

    public void setRentBehavior(RentBehavior rentBehavior) {
        this.rentBehavior = rentBehavior;
    }

    public PurchaseBehavior getPurchaseBehavior() {
        return purchaseBehavior;
    }

    public void setPurchaseBehavior(PurchaseBehavior purchaseBehavior) {
        this.purchaseBehavior = purchaseBehavior;
    }
}

