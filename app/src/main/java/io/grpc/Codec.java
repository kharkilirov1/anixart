package io.grpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@ExperimentalApi
/* loaded from: classes3.dex */
public interface Codec extends Compressor, Decompressor {

    public static final class Gzip implements Codec {
        @Override // io.grpc.Compressor, io.grpc.Decompressor
        /* renamed from: a */
        public String mo30824a() {
            return "gzip";
        }

        @Override // io.grpc.Decompressor
        /* renamed from: b */
        public InputStream mo30825b(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        @Override // io.grpc.Compressor
        /* renamed from: c */
        public OutputStream mo30826c(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    }

    public static final class Identity implements Codec {

        /* renamed from: a */
        public static final Codec f58087a = new Identity();

        @Override // io.grpc.Compressor, io.grpc.Decompressor
        /* renamed from: a */
        public String mo30824a() {
            return "identity";
        }

        @Override // io.grpc.Decompressor
        /* renamed from: b */
        public InputStream mo30825b(InputStream inputStream) {
            return inputStream;
        }

        @Override // io.grpc.Compressor
        /* renamed from: c */
        public OutputStream mo30826c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
