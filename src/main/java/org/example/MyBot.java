package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    MyBotService myBotService = new MyBotService();


    int natijalarIT =0;
    int natijalarEnglish=0;
    int natijalarMath=0;

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {


            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();
            info(chatId, firstName, lastName, text);


            if (text.equals("/start")) {
                try {
                    execute(myBotService.sendMessage1(chatId));
                    execute(myBotService.ozbektilimenu1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("O'zbek tili")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Savol darajasi")) {
                try {
                    execute(myBotService.savoldarajasi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("fan")) {
                try {
                    execute(myBotService.fanlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Savolar")) {
                try {
                    execute(myBotService.it(chatId));
                    execute(myBotService.itsavol2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("IT")) {
                try {
                    execute(myBotService.savoldarajasi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Matematika")){
                try {
                    execute(myBotService.savoldarajasi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("English")){
                try {
                    execute(myBotService.savoldarajasi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Oson")) {
                try {
                    execute(myBotService.it(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ortacha")){
                try {
                    execute(myBotService.Matematika(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qiyin")){
                try {
                    execute(myBotService.English(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        else if (update.hasMessage() && update.getMessage().hasContact()) {
            Long chatId = update.getMessage().getChatId();
            try {
                execute(myBotService.sendLocationShare(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        else if (update.hasMessage() && update.getMessage().hasLocation()) {
            Long chatId = update.getMessage().getChatId();

            try {
                execute(myBotService.fanlar(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }
        else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

            System.out.println("data");

            Long chatId = callbackQuery.getMessage().getChatId();

            if (data.equals("privateId")) {
                natijalarIT +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("classId")) {
                natijalarIT +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
           /* if (data.equals("keyingisavolId")) {
                try {
                    execute(myBotService.itsavol2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("privateId")) {
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavolId")) {
                try {
                    execute(myBotService.itsavol3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }*/

            if (data.equals("keyingisavol1Id")){
                try {
                    execute(myBotService.itsavol2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("tortta1Id")){
                natijalarIT +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol2Id")){
                try {
                    execute(myBotService.itsavol3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("while2Id")){
                natijalarIT +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("keyingisavol3Id")){
                try {
                    execute(myBotService.itsavol4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("literalId")){
                natijalarIT +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol4Id")){
                try {
                    execute(myBotService.itsavol5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("99Id")){
                natijalarMath +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol5Id")){
                try {
                    execute(myBotService.Matematikasavol2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("220Id")){
                natijalarMath +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("natijaId")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Sizning natijangiz " + natijalarIT);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol6Id")){
                try {
                    execute(myBotService.Matematikasavol3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("49Id")){
                natijalarMath +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol7Id")){
                try {
                    execute(myBotService.Matematikasavol4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("8Id")){
                natijalarMath +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol8Id")){
                try {
                    execute(myBotService.Matematikasavol5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("81Id")){
                natijalarMath +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("natijaId")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Sizning natijangiz " + natijalarMath);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol9Id")){
                try {
                    execute(myBotService.English(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("suzishId")){
                natijalarEnglish +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol10Id")){
                try {
                    execute(myBotService.English2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("quyoshId")){
                natijalarEnglish +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol11Id")){
                try {
                    execute(myBotService.English3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("yugurishid")){
                natijalarEnglish +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol12Id")){
                try {
                    execute(myBotService.English4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("fermaId")){
                natijalarEnglish +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("keyingisavol13Id")){
                try {
                    execute(myBotService.English5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("choyId")){
                natijalarEnglish +=33;
                try {
                    execute(myBotService.jovob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("natijaId")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Sizning natijangiz " + natijalarEnglish);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    @Override
    public String getBotToken() {
        return "7664321321:AAGim_1wDhqkuHTifAg7xEvse7Ij5idNuOU";
    }

    @Override
    public String getBotUsername() {
        return "NewTelegeamBot";
    }

    public void info(Long chatId, String firstName, String lastName, String text) {

        System.out.println("ChatId:" + chatId + "\n"
                + "FirstName:" + firstName + "\n"
                + "LastName:" + lastName + "\n"
                + "Text:" + text + "\n");
    }
}

