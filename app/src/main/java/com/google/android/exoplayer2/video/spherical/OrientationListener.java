package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

/* loaded from: classes.dex */
final class OrientationListener implements SensorEventListener {

    /* renamed from: a */
    public final float[] f14925a = new float[16];

    /* renamed from: b */
    public final float[] f14926b = new float[16];

    /* renamed from: c */
    public final float[] f14927c = new float[16];

    /* renamed from: d */
    public final float[] f14928d = new float[3];

    /* renamed from: e */
    public final Display f14929e;

    /* renamed from: f */
    public final Listener[] f14930f;

    /* renamed from: g */
    public boolean f14931g;

    public interface Listener {
        /* renamed from: a */
        void mo7822a(float[] fArr, float f2);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.f14929e = display;
        this.f14930f = listenerArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f14925a, sensorEvent.values);
        float[] fArr = this.f14925a;
        int rotation = this.f14929e.getRotation();
        if (rotation != 0) {
            int i2 = 129;
            int i3 = 130;
            if (rotation == 1) {
                i2 = 2;
                i3 = 129;
            } else if (rotation != 2) {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
                i3 = 1;
            }
            float[] fArr2 = this.f14926b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f14926b, i2, i3, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f14925a, 1, 131, this.f14926b);
        SensorManager.getOrientation(this.f14926b, this.f14928d);
        float f2 = this.f14928d[2];
        Matrix.rotateM(this.f14925a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f14925a;
        if (!this.f14931g) {
            FrameRotationQueue.m7821a(this.f14927c, fArr3);
            this.f14931g = true;
        }
        float[] fArr4 = this.f14926b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f14926b, 0, this.f14927c, 0);
        float[] fArr5 = this.f14925a;
        for (Listener listener : this.f14930f) {
            listener.mo7822a(fArr5, f2);
        }
    }
}
