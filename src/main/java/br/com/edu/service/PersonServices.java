package br.com.edu.service;

import br.com.edu.Exceptions.ResourceNotFoundException;

import br.com.edu.data.dto.v1.PersonDTO;
import br.com.edu.data.dto.v2.PersonDTOV2;
import br.com.edu.mapper.custom.PersonMapper;
import br.com.edu.model.Person;
import br.com.edu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

import static br.com.edu.mapper.ObjectMapper.parseListObject;
import static br.com.edu.mapper.ObjectMapper.parseObject;

@Service
public class PersonServices {

    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    @Autowired
    PersonMapper mapper;

    public PersonDTO findById(Long id) {
        logger.info("Finding one person!");
        return parseObject(repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No person found with id: " + id)), PersonDTO.class);
    }

    public List<PersonDTO> findAll() {
        logger.info("Finding all people!");
        return parseListObject(repository.findAll(), PersonDTO.class);
    }

    public PersonDTO create(PersonDTO person) {
        logger.info("Creating one person!");

        return parseObject(repository.save(parseObject(person, Person.class)), PersonDTO.class);
    }

    public PersonDTOV2 createV2(PersonDTOV2 person) {
        logger.info("Creating one person!");
        return mapper.convertEntityToDTO(repository.save(mapper.converDTOToEntity(person)));
    }

    public PersonDTO update(PersonDTO person) {
        logger.info("Creating one person!");
        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No person found with id: " + person.getId()));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return parseObject(repository.save(entity),PersonDTO.class);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!" + id);
        Person entity = repository.findById(id).
        orElseThrow(() -> new ResourceNotFoundException("No person found with id: " +id));
        repository.delete(entity);
    }
}
