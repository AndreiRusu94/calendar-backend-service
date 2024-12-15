import calendar.backend.service.data.model.User;
import calendar.backend.service.data.repository.UserRepository;

module service {
    requires data;

    requires static lombok;
    requires spring.beans;
    requires spring.context;

    uses User;
    uses UserRepository;
}