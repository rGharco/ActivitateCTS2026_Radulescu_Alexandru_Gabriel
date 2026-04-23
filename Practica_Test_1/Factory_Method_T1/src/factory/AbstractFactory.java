package factory;

import clase.PersonalSpital;

public interface AbstractFactory {
    PersonalSpital getPersonal(ITipMedical tip, String nume, int varsta);
}
