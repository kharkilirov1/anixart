package io.grpc.protobuf.lite;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.ExperimentalApi;
import io.grpc.KnownLength;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class ProtoLiteUtils {

    /* renamed from: a */
    public static volatile ExtensionRegistryLite f59485a = ExtensionRegistryLite.m13368a();

    public static final class MessageMarshaller<T extends MessageLite> implements MethodDescriptor.PrototypeMarshaller<T> {

        /* renamed from: c */
        public static final ThreadLocal<Reference<byte[]>> f59486c = new ThreadLocal<>();

        /* renamed from: a */
        public final Parser<T> f59487a;

        /* renamed from: b */
        public final T f59488b;

        @Override // io.grpc.MethodDescriptor.Marshaller
        /* renamed from: a */
        public Object mo30924a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof ProtoInputStream) && ((ProtoInputStream) inputStream).f59483c == this.f59487a) {
                try {
                    MessageLite messageLite = ((ProtoInputStream) inputStream).f59482b;
                    if (messageLite != null) {
                        return messageLite;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
            CodedInputStream codedInputStream = null;
            try {
                if (inputStream instanceof KnownLength) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f59486c;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i2 = available;
                        while (i2 > 0) {
                            int read = inputStream.read(bArr, available - i2, i2);
                            if (read == -1) {
                                break;
                            }
                            i2 -= read;
                        }
                        if (i2 != 0) {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i2));
                        }
                        codedInputStream = CodedInputStream.m13174g(bArr, 0, available);
                    } else if (available == 0) {
                        return this.f59488b;
                    }
                }
                if (codedInputStream == null) {
                    codedInputStream = CodedInputStream.m13173f(inputStream);
                }
                codedInputStream.f23995c = Integer.MAX_VALUE;
                try {
                    T mo12985a = this.f59487a.mo12985a(codedInputStream, ProtoLiteUtils.f59485a);
                    try {
                        codedInputStream.mo13179a(0);
                        return mo12985a;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f24221b = mo12985a;
                        throw e2;
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw new StatusRuntimeException(Status.f58286m.m30947g("Invalid protobuf byte sequence").m30946f(e3));
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        /* renamed from: b */
        public InputStream mo30925b(Object obj) {
            return new ProtoInputStream((MessageLite) obj, this.f59487a);
        }
    }

    public static final class MetadataMarshaller<T extends MessageLite> implements Metadata.BinaryMarshaller<T> {
    }
}
