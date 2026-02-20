package com.capgemini.hibernate.UnidirectionalMappingTask;

import jakarta.persistence.*;

@Entity
@Table(name = "lockers")
public class Locker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lockerId;

    @Column(nullable = false, unique = true)
    private String lockerNumber;

    @Column(nullable = false)
    private int floor;

    // Constructors
    public Locker() {}
    
    public Locker(String lockerNumber, int floor) {
        this.lockerNumber = lockerNumber;
        this.floor = floor;
    }

    // Getters and Setters
    public Long getLockerId() { return lockerId; }
    public void setLockerId(Long lockerId) { this.lockerId = lockerId; }

    public String getLockerNumber() { return lockerNumber; }
    public void setLockerNumber(String lockerNumber) { this.lockerNumber = lockerNumber; }

    public int getFloor() { return floor; }
    public void setFloor(int floor) { this.floor = floor; }
}
