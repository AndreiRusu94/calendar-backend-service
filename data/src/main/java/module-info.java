module data {
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.mongodb;
    requires static lombok;

    exports calendar.backend.service.data.model;
    exports calendar.backend.service.data.repository;
}