package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.wr */
/* loaded from: classes3.dex */
public final class C5985wr {

    /* renamed from: a */
    private final ByteArrayOutputStream f56231a;

    /* renamed from: b */
    private final DataOutputStream f56232b;

    public C5985wr() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
        this.f56231a = byteArrayOutputStream;
        this.f56232b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public final byte[] m29532a(EventMessage eventMessage) {
        this.f56231a.reset();
        try {
            DataOutputStream dataOutputStream = this.f56232b;
            dataOutputStream.writeBytes(eventMessage.f48063a);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f48064b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f56232b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f56232b.writeLong(eventMessage.f48065c);
            this.f56232b.writeLong(eventMessage.f48066d);
            this.f56232b.write(eventMessage.f48067e);
            this.f56232b.flush();
            return this.f56231a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
