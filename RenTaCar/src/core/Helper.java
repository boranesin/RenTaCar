package core;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setTheme() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if ("Substance".equals(info.getName()))
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e){
                    System.out.println(e.getMessage());
                } break;
        }
    }
    public static void showMsg(String str){
        String msg;
        String title;

       switch (str) {
           case "fill" :
               msg = " Lütfen tüm alanları doldurunuz.";
               title = "Hata";
               break;
           case "done" :
               msg = " İşlem tamamlandı.";
               title = "Sonuç";
               break;
           case "notFound" :
               msg = "Kayıt bulunamadı";
               title = "Bulunamadı";
               break;
           case "error" :
               msg = "Hatalı İşlem yaptınız";
               title = "Hata";
               break;
           default:
               msg = str;
               title = "Mesaj";
       }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str){
        optionPaneTR();
        String msg;
        if (str.equals("sure")){
            msg = "Emin misin?";
        } else {
            msg = str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Eminmisin",JOptionPane.YES_NO_OPTION) == 0;
    }

    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();

    }

    public static boolean isFieldListEmpty(JTextField[] fieldlist) {
    for (JTextField field : fieldlist) {
        if (isFieldEmpty(field))
            return true;
    }
    return false;
    }
    public static int getLocationPoint(String type, Dimension size){
        return switch (type) {
            case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
            default -> 0;
        };
    }
    public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText", "Tamam");
        UIManager.put("OptionPane.yesButtonText", "Efet");
        UIManager.put("OptionPane.noButtonText", "Nayır");
    }
}
