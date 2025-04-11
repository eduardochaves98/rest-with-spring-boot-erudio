package br.com.edu.mapper.custom;

import br.com.edu.data.dto.v2.PersonDTOV2;
import br.com.edu.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person){
        PersonDTOV2 personDTO = new PersonDTOV2();
        personDTO.setId(person.getId());
        personDTO.setFirstName(person.getFirstName());
        personDTO.setLastName(person.getLastName());
        personDTO.setAddress(person.getAddress());
        personDTO.setGender(person.getGender());
        personDTO.setBirthDate(new Date()); //TODO atualizar com o valor correto ao criar a entidade
        return personDTO;
    }

    public Person converDTOToEntity(PersonDTOV2 person){
        Person personDTO = new Person();
        personDTO.setId(person.getId());
        personDTO.setFirstName(person.getFirstName());
        personDTO.setLastName(person.getLastName());
        personDTO.setAddress(person.getAddress());
        personDTO.setGender(person.getGender());
        //personDTO.setBirthDate(new Date()); //TODO atualizar com o valor correto ao criar a entidade
        return personDTO;
    }
}
