import calendar.backend.service.data.model.Person;
import calendar.backend.service.data.repository.PersonRepository;

open module service {
    requires data;

    requires static lombok;
    requires spring.beans;
    requires spring.context;
    requires spring.web;

    uses Person;
    uses PersonRepository;
}