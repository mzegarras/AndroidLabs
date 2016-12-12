package net.msonic.lab02;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TipoCambioService extends Service {

    private static final String TAG = TipoCambioService.class.getName();
    private  double TIPO_CAMBIO=0L;



    private Timer timer;
    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            Calendar c = Calendar.getInstance();
            Log.d(TAG,c.getTime().toString());

            Random random = new Random();
            TIPO_CAMBIO = random.nextDouble();

            Log.i(TAG, "Tipo Cambio Service:" + String.valueOf(TIPO_CAMBIO));

            enviarNotificacion();
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        Log.i(TAG, "Servicio Iniciado");

        timer = new Timer(TAG);
        timer.schedule(task,1000,1000 * 10);

    }


    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        timer.cancel();
        Log.i(TAG, "Servicio Detenido");

    }

    public void enviarNotificacion(){
        Intent i = new Intent("pe.edu.dat.TipoCambioReciever");
        i.putExtra("TC",TIPO_CAMBIO);
        sendBroadcast(i);
    }
}
