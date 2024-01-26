package org.comapsy;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class ComaPsyBotApp extends TelegramLongPollingBot {
    private static final String botToken = System.getProperty("coma.bot.token");

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        BotSession session = botsApi.registerBot(new ComaPsyBotApp());
    }

    public ComaPsyBotApp() {
        super(botToken);
    }

    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return "ComaPsyBot";
    }

}
