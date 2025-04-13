package com.google.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite.Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    public int memoizedHashCode = 0;

    public interface InternalOneOfEnum {
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: f */
    public void mo12975f(OutputStream outputStream) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int mo13430c = generatedMessageLite.mo13430c();
        Logger logger = CodedOutputStream.f24038b;
        if (mo13430c > 4096) {
            mo13430c = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, mo13430c);
        generatedMessageLite.mo13433g(outputStreamEncoder);
        if (outputStreamEncoder.f24043f > 0) {
            outputStreamEncoder.m13317T0();
        }
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: h */
    public ByteString mo12976h() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int mo13430c = generatedMessageLite.mo13430c();
            ByteString byteString = ByteString.f23981c;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(mo13430c, null);
            generatedMessageLite.mo13433g(codedBuilder.f23989a);
            codedBuilder.f23989a.m13296S();
            return new ByteString.LiteralByteString(codedBuilder.f23990b);
        } catch (IOException e2) {
            throw new RuntimeException(m12980l("ByteString"), e2);
        }
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: i */
    public byte[] mo12977i() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int mo13430c = generatedMessageLite.mo13430c();
            byte[] bArr = new byte[mo13430c];
            Logger logger = CodedOutputStream.f24038b;
            CodedOutputStream.ArrayEncoder arrayEncoder = new CodedOutputStream.ArrayEncoder(bArr, 0, mo13430c);
            generatedMessageLite.mo13433g(arrayEncoder);
            arrayEncoder.m13296S();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(m12980l("byte array"), e2);
        }
    }

    /* renamed from: j */
    public int mo12978j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public int m12979k(Schema schema) {
        int mo12978j = mo12978j();
        if (mo12978j != -1) {
            return mo12978j;
        }
        int mo13544h = schema.mo13544h(this);
        mo12981m(mo13544h);
        return mo13544h;
    }

    /* renamed from: l */
    public final String m12980l(String str) {
        StringBuilder m24u = C0000a.m24u("Serializing ");
        m24u.append(getClass().getName());
        m24u.append(" to a ");
        m24u.append(str);
        m24u.append(" threw an IOException (should never happen).");
        return m24u.toString();
    }

    /* renamed from: m */
    public void mo12981m(int i2) {
        throw new UnsupportedOperationException();
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.MessageLite.Builder
        /* renamed from: F0 */
        public MessageLite.Builder mo12982F0(MessageLite messageLite) {
            if (((GeneratedMessageLite.Builder) this).f24184b.getClass().isInstance(messageLite)) {
                return mo12984k((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // 
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType clone();

        /* renamed from: k */
        public abstract BuilderType mo12984k(MessageType messagetype);

        public static final class LimitedInputStream extends FilterInputStream {

            /* renamed from: b */
            public int f23950b;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f23950b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f23950b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f23950b--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
                long skip = super.skip(Math.min(j2, this.f23950b));
                if (skip >= 0) {
                    this.f23950b = (int) (this.f23950b - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i4 = this.f23950b;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f23950b -= read;
                }
                return read;
            }
        }
    }
}
