package com.libin.demo;

import com.asprise.imaging.core.Imaging;
import com.asprise.imaging.core.Request;
import com.asprise.imaging.core.Result;

import java.io.IOException;


/**
 * @author libin9iOak
 */
public class JavaScannerUtil  {
    public static void main(String[] args) throws IOException {


       Imaging imaging = new Imaging("myApp", 0);

       // 启动界面
        imaging.setUseAspriseSourceSelectUI(false);

Result result = imaging.scan(Request.fromJson(
                """
                          {
                            "twain_cap_setting" : {
                              "ICAP_PIXELTYPE" : "TWPT_RGB",
                              "ICAP_XRESOLUTION" : "100",
                              "ICAP_YRESOLUTION" : "100",
                              "ICAP_SUPPORTEDSIZES" : "A4"
                            },
                            "output_settings" : [ {
                              "type" : "save",
                              "format" : "jpg",
                              "save_path" : "I:/JavaScanner/2.jpg"
                            } ]
                          }
                        """), "select", false, false);

     /*   Result result = new AspriseScanUI().setRequest(
                        new Request().addOutputItem(
                                new RequestOutputItem(Imaging.OUTPUT_SAVE, Imaging.FORMAT_PDF)
                                        .setSavePath("I:/javatest/")))
                .setInstruction("Scan <b>test</b>")
                .showDialog(new Component() {
                } , "Dialog Title", true, null)
                ;


*/




    }
}