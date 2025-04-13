package com.google.android.exoplayer2.metadata.emsg;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class EventMessageEncoder {

    /* renamed from: a */
    public final ByteArrayOutputStream f12009a;

    /* renamed from: b */
    public final DataOutputStream f12010b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
        this.f12009a = byteArrayOutputStream;
        this.f12010b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public byte[] m6707a(EventMessage eventMessage) {
        this.f12009a.reset();
        try {
            DataOutputStream dataOutputStream = this.f12010b;
            dataOutputStream.writeBytes(eventMessage.f12003b);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f12004c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f12010b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f12010b.writeLong(eventMessage.f12005d);
            this.f12010b.writeLong(eventMessage.f12006e);
            this.f12010b.write(eventMessage.f12007f);
            this.f12010b.flush();
            return this.f12009a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
