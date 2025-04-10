package br.com.edu.model;

import java.io.Serializable;

public record Person(Long id, String firstName, String lastName, String address, String gender) implements Serializable {
}
