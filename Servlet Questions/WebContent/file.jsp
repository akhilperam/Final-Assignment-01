<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Other Page</title>
</head>
<body>
    <h1>Welcome to the Other Page</h1>
    <%
        // Retrieve the user's name from the session
        String name = (String) session.getAttribute("name");
        if (name != null) {
            out.println("Your name: " + name);
        } else {
            out.println("Your name is not set.");
        }
    %>
</body>
</html>