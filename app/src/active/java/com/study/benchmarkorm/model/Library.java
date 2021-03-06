package com.study.benchmarkorm.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

@Table(name = "Library")
public class Library extends Model{
    @Column(name = "address")
    private String address;
    @Column(name = "name")
    private String name;

    public Library() {
    }

    public Library(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getEmployees() {
        return getMany(Person.class,"library");
    }
    public List<Book> getBooks() {
        return getMany(Book.class,"library");
    }
}
