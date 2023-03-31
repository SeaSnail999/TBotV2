import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Dialog {
    public static class Message {
        String command;
        String body;
        String action;

        public Message(String command, String body, String action) {
            this.command = '/' + command;
            this.body = body;
            this.action = action;
            System.out.println(this);
        }

        @Override
        public String toString() {
            JSONObject object = new JSONObject();
            object.put("command", command);
            object.put("body", body);
            object.put("action", action);

            return object.toString();
        }
    }

    static HashMap<String, Message> messages = new HashMap<>();

    static void parseInput(String input) {
        input = input.substring(1);
        String[] msgs = input.split("\n\n/");
        for (String msg: msgs) {
            Message message = parseMessage(msg);
            messages.put(message.command, message);
        }
    }

    static String getResponse(String command) {
        if (messages.containsKey(command))
            return messages.get(command).body;
        else return messages.get("/default").body;
    }

    static Message parseMessage(String message) {
        int bodyIndex = message.indexOf('%');
        int actionIndex = message.lastIndexOf('%');

        String command = message.substring(0, bodyIndex - 1);
        String body = message.substring(bodyIndex + 2, actionIndex - 1);
        String action = message.substring(actionIndex, message.length() - 1);

        return new Message(command, body, action);
    }

    static String input;

    static {
        input = readFile("/var/www/html/config");
        parseInput(input);
    }

    static String readFile(String path) {
        byte[] bytes = null;
        try {
            InputStream in = new FileInputStream(path);
            //InputStream in = Files.newInputStream(Paths.get("/home/user/config/config.txt"));
            assert in != null;
            bytes = in.readAllBytes();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert bytes != null;
        return new String(bytes);
    }

    public static String readRecourse(String path) {
        byte[] bytes = null;
        try {
            InputStream in = Dialog.class.getResourceAsStream(path);
            //InputStream in = Files.newInputStream(Paths.get("/home/user/config/config.txt"));
            assert in != null;
            bytes = in.readAllBytes();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert bytes != null;
        return new String(bytes);
    }
}
