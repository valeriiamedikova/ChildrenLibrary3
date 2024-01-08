<%-- 
    Document   : index
    Created on : 30.04.2023
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <body>
        <header>
            <a href="/"><img alt="Логотип" id="top-image" src="#"/></a>
            <div id="user-panel">
                <a href="#"><img alt="Иконка юзера" scr=""/></a>
                <a href="javascript:void(0);">[Панель для юзера]</a>
            </div>
        </header>
        <div id="main">
            <aside class="leftAside">
                <h2>Что нужно для регистрации</h2>
                <p>Что бы регистрация прошла успешно, заполните все поля и нажмите на
                кнопку "Зарегистрироваться"
                </p>
            </aside>
            <section>
                <book>
                    <h1>Регистрация</h1>
                    <div class="text-book">
                        <form method="POST" action="registration">
                        <p>
                            <label for="login">Логин</label>
                            <input type="text" name="login" id="login"/>
                        </p>
                        <p>
                        <label for="email">E-Mail</label>
                        <input type="email" name="email" id="email"/>
                        </p>
                        <p>
                        <label for="password">Пароль</label>
                        <input type="password" name="password" id="password"/>
                        
                        <label for="password2">Повторите пароль</label>
                        <input type="password" name="password2" id="password2"/>
                        </p>
                        <p>
                            <button type="submit">Зарегистрироваться</button>
                        </p>
                        </form>
                    </div>
                </book>
            </section>
        </div>