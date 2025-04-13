package io.grpc.protobuf.lite;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Preconditions;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.Drainable;
import io.grpc.KnownLength;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class ProtoInputStream extends InputStream implements Drainable, KnownLength {

    /* renamed from: b */
    @Nullable
    public MessageLite f59482b;

    /* renamed from: c */
    public final Parser<?> f59483c;

    /* renamed from: d */
    @Nullable
    public ByteArrayInputStream f59484d;

    public ProtoInputStream(MessageLite messageLite, Parser<?> parser) {
        this.f59482b = messageLite;
        this.f59483c = parser;
    }

    @Override // io.grpc.Drainable
    /* renamed from: a */
    public int mo30858a(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.f59482b;
        if (messageLite != null) {
            int mo13430c = messageLite.mo13430c();
            this.f59482b.mo12975f(outputStream);
            this.f59482b = null;
            return mo13430c;
        }
        ByteArrayInputStream byteArrayInputStream = this.f59484d;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = ProtoLiteUtils.f59485a;
        Preconditions.m11187k(byteArrayInputStream, "inputStream cannot be null!");
        Preconditions.m11187k(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
        long j2 = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i2 = (int) j2;
                this.f59484d = null;
                return i2;
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        MessageLite messageLite = this.f59482b;
        if (messageLite != null) {
            return messageLite.mo13430c();
        }
        ByteArrayInputStream byteArrayInputStream = this.f59484d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f59482b != null) {
            this.f59484d = new ByteArrayInputStream(this.f59482b.mo12977i());
            this.f59482b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f59484d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        MessageLite messageLite = this.f59482b;
        if (messageLite != null) {
            int mo13430c = messageLite.mo13430c();
            if (mo13430c == 0) {
                this.f59482b = null;
                this.f59484d = null;
                return -1;
            }
            if (i3 >= mo13430c) {
                CodedOutputStream m13281x0 = CodedOutputStream.m13281x0(bArr, i2, mo13430c);
                this.f59482b.mo13433g(m13281x0);
                m13281x0.m13296S();
                this.f59482b = null;
                this.f59484d = null;
                return mo13430c;
            }
            this.f59484d = new ByteArrayInputStream(this.f59482b.mo12977i());
            this.f59482b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f59484d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i2, i3);
        }
        return -1;
    }
}
