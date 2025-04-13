package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

/* loaded from: classes3.dex */
final class ro0 implements SensorEventListener {

    /* renamed from: a */
    private final float[] f54371a = new float[16];

    /* renamed from: b */
    private final float[] f54372b = new float[16];

    /* renamed from: c */
    private final float[] f54373c = new float[16];

    /* renamed from: d */
    private final float[] f54374d = new float[3];

    /* renamed from: e */
    private final Display f54375e;

    /* renamed from: f */
    private final InterfaceC5702a[] f54376f;

    /* renamed from: g */
    private boolean f54377g;

    /* renamed from: com.yandex.mobile.ads.impl.ro0$a */
    public interface InterfaceC5702a {
        /* renamed from: a */
        void mo26348a(float[] fArr, float f2);
    }

    public ro0(Display display, InterfaceC5702a... interfaceC5702aArr) {
        this.f54375e = display;
        this.f54376f = interfaceC5702aArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f54371a, sensorEvent.values);
        float[] fArr = this.f54371a;
        int rotation = this.f54375e.getRotation();
        if (rotation != 0) {
            int i2 = 130;
            int i3 = 129;
            if (rotation == 1) {
                i2 = 2;
            } else if (rotation == 2) {
                i2 = 129;
                i3 = 130;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i3 = 1;
            }
            float[] fArr2 = this.f54372b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f54372b, i2, i3, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f54371a, 1, 131, this.f54372b);
        SensorManager.getOrientation(this.f54372b, this.f54374d);
        float f2 = this.f54374d[2];
        Matrix.rotateM(this.f54371a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f54371a;
        if (!this.f54377g) {
            C5889uv.m29140a(this.f54373c, fArr3);
            this.f54377g = true;
        }
        float[] fArr4 = this.f54372b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f54372b, 0, this.f54373c, 0);
        float[] fArr5 = this.f54371a;
        for (InterfaceC5702a interfaceC5702a : this.f54376f) {
            interfaceC5702a.mo26348a(fArr5, f2);
        }
    }
}
