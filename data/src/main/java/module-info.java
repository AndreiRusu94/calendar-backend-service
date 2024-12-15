open module data {
    requires spring.context;
    requires static lombok;
    requires spring.data.commons;
    requires jakarta.persistence;
    requires spring.data.jpa;

    exports calendar.backend.service.data.model;
    exports calendar.backend.service.data.repository;
}