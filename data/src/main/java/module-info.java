module data {
    requires spring.context;
    requires static lombok;
    requires spring.data.commons;

    exports calendar.backend.service.data.model;
    exports calendar.backend.service.data.repository;
}