package io.grpc.internal;

import com.google.gson.stream.JsonToken;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class JsonParser {

    /* renamed from: a */
    public static final Logger f58787a = Logger.getLogger(JsonParser.class.getName());

    /* renamed from: io.grpc.internal.JsonParser$1 */
    public static /* synthetic */ class C64141 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58788a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f58788a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58788a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58788a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58788a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58788a[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58788a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
