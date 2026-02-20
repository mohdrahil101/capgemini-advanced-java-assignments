package com.capgemini.hibernate.UnidirectionalMappingTask;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    @OneToOne(cascade = CascadeType.ALL) // Employee owns the relationship
    @JoinColumn(name = "locker_id", unique = true) // Foreign key in Employee table
    private Locker locker;

    // Constructors
    public Employee() {}
    
    public Employee(String name, String department, Locker locker) {
        this.name = name;
        this.department = department;
        this.locker = locker;
    }

    // Getters and Setters
    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public Locker getLocker() { return locker; }
    public void setLocker(Locker locker) { this.locker = locker; }
}
