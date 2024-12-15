import calendar.backend.service.data.model.User;
import calendar.backend.service.data.repository.UserRepository;

open module service {
    requires data;

    requires static lombok;
    requires spring.beans;
    requires spring.context;
    requires spring.web;

    uses User;
    uses UserRepository;
}