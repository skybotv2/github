<!doctype html>
<html>
  <body>
    <p>You entered: <strong><%= request.getAttribute("input") %></strong></p>
    <a href="<%= request.getContextPath() %>/echo">Back</a>
  </body>
</html>
