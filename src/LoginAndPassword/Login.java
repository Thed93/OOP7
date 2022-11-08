package LoginAndPassword;

import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

//Напишем программу, которая проверяет корректность введенных данных логина и пароля.
//
//        Создайте новый класс и в нем — статический метод, который принимает на вход три параметра: login, password и confirmPassword.
//
//        Вводные по данным:
//
//        Логин содержит в себе только латинские буквы, цифры и знак подчеркивания.
//        Длина логина может быть от 1 до 20 символов. Если логин не указан или длиннее заданной формы, содержит в себе другие знаки, то нужно выбросить
//        WrongLoginException
//        .
//        Password содержит в себе только латинские буквы, цифры и знак подчеркивания. Длина password может быть от 1 до 20 символов. Password и confirmPassword должны быть равны. Если password не указан или длиннее заданной формы, содержит в себе другие знаки, password и confirmPassword не равны, то нужно выбросить
//        WrongPasswordException
//        .
//        WrongPasswordException
//        и
//        WrongLoginException
//        — пользовательские классы исключения с двумя конструкторами: один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса
//        Exception
//        .
//        Подсказка
//        Если все вводимые значения корректны и верны, то метод должен возвращать
//        true
//        . Если данные некорректны или не выполняют всех условий, то метод выбрасывает исключение.
//
//        В методе main необходимо вызывать созданный метод и обрабатывать ошибки.
public class Login {

    public static void confirmLiginAndPassword(String login, String password, String confirmPassword, User user) throws WrongLoginException, WrongPasswordException {
        if (login.equals(user.getLogin())){
            System.out.println("Логин введен корректно");
        } else {
            throw new WrongLoginException("Логин введен некорректно");
        }
        if (password.equals(user.getPassword())) {
            System.out.println("Пароль введен корректно");
        } else {
            throw new WrongPasswordException("Пароль введен некорректно");
        }
        if (confirmPassword.equals(password)){
            System.out.println("Подтверждение пароля прошло!");
        } else {
            throw new WrongPasswordException("Подтверждение пароля не прошло!");
        }
        System.out.println("Добро пожаловать " + user.getLogin() + "!");
    }
}
