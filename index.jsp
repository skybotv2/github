<!doctype html>
<html>
  <body>
    <h1>Hello World, testing with CHATGPT</h1>
    <form action="<%= request.getContextPath() %>/echo" method="post">
      <label>Enter some text:</label>
      <input type="text" name="input" />
      <button type="submit">Submit</button>
    </form>
  </body>
</html>
