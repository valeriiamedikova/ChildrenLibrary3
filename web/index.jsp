<%-- 
    Document   : index
    Created on : 30.04.2023
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div id="main">
            <aside class="leftAside">
                <h2>Жанры</h2>
                <ul>
                    <li><a href="#">Фантастика</a></li>
                    <li><a href="#">Детектив</a></li>
                    <li><a href="#">Приключения</a></li>
                    <li><a href="#">Биография</a></li>
                </ul>
            </aside>
            <section>
                <c:forEach var="books" items="${books}">
                    <book>
                        <h1>${books.title}</h1>
                        <div class="text-book">
                            ${fn:substring(books.remark,0,300)} ...
                        </div>
                        <div class="fotter-book">
                            <span class="autor">Автор: <a href="#">${books.author}</a></span>
                            <span class="lending"><a href="books?id=${books.id}">Выдать читателю</a></span>
                            <span class="date-book">Год: ${books.date}</span>
                        </div>
                    </book>
                </c:forEach>
            </section>
        </div>
    </body>
</html>