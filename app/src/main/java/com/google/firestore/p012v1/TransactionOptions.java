package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class TransactionOptions extends GeneratedMessageLite<TransactionOptions, Builder> implements TransactionOptionsOrBuilder {
    private static final TransactionOptions DEFAULT_INSTANCE;
    private static volatile Parser<TransactionOptions> PARSER = null;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    /* renamed from: com.google.firestore.v1.TransactionOptions$1 */
    public static /* synthetic */ class C22251 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23617a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23617a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23617a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23617a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23617a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23617a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23617a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23617a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TransactionOptions, Builder> implements TransactionOptionsOrBuilder {
        public Builder() {
            super(TransactionOptions.DEFAULT_INSTANCE);
        }

        public Builder(C22251 c22251) {
            super(TransactionOptions.DEFAULT_INSTANCE);
        }
    }

    public enum ModeCase {
        /* JADX INFO: Fake field, exist only in values array */
        READ_ONLY(2),
        /* JADX INFO: Fake field, exist only in values array */
        READ_WRITE(3),
        /* JADX INFO: Fake field, exist only in values array */
        MODE_NOT_SET(0);

        ModeCase(int i2) {
        }
    }

    public static final class ReadOnly extends GeneratedMessageLite<ReadOnly, Builder> implements ReadOnlyOrBuilder {
        private static final ReadOnly DEFAULT_INSTANCE;
        private static volatile Parser<ReadOnly> PARSER = null;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        public static final class Builder extends GeneratedMessageLite.Builder<ReadOnly, Builder> implements ReadOnlyOrBuilder {
            public Builder() {
                super(ReadOnly.DEFAULT_INSTANCE);
            }

            public Builder(C22251 c22251) {
                super(ReadOnly.DEFAULT_INSTANCE);
            }
        }

        public enum ConsistencySelectorCase {
            /* JADX INFO: Fake field, exist only in values array */
            READ_TIME(2),
            /* JADX INFO: Fake field, exist only in values array */
            CONSISTENCYSELECTOR_NOT_SET(0);

            ConsistencySelectorCase(int i2) {
            }
        }

        static {
            ReadOnly readOnly = new ReadOnly();
            DEFAULT_INSTANCE = readOnly;
            GeneratedMessageLite.m13417F(ReadOnly.class, readOnly);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", Timestamp.class});
                case NEW_MUTABLE_INSTANCE:
                    return new ReadOnly();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ReadOnly> parser = PARSER;
                    if (parser == null) {
                        synchronized (ReadOnly.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface ReadOnlyOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ReadWrite extends GeneratedMessageLite<ReadWrite, Builder> implements ReadWriteOrBuilder {
        private static final ReadWrite DEFAULT_INSTANCE;
        private static volatile Parser<ReadWrite> PARSER = null;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private ByteString retryTransaction_ = ByteString.f23981c;

        public static final class Builder extends GeneratedMessageLite.Builder<ReadWrite, Builder> implements ReadWriteOrBuilder {
            public Builder() {
                super(ReadWrite.DEFAULT_INSTANCE);
            }

            public Builder(C22251 c22251) {
                super(ReadWrite.DEFAULT_INSTANCE);
            }
        }

        static {
            ReadWrite readWrite = new ReadWrite();
            DEFAULT_INSTANCE = readWrite;
            GeneratedMessageLite.m13417F(ReadWrite.class, readWrite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: p */
        public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
                case NEW_MUTABLE_INSTANCE:
                    return new ReadWrite();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ReadWrite> parser = PARSER;
                    if (parser == null) {
                        synchronized (ReadWrite.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface ReadWriteOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        TransactionOptions transactionOptions = new TransactionOptions();
        DEFAULT_INSTANCE = transactionOptions;
        GeneratedMessageLite.m13417F(TransactionOptions.class, transactionOptions);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    /* renamed from: p */
    public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mode_", "modeCase_", ReadOnly.class, ReadWrite.class});
            case NEW_MUTABLE_INSTANCE:
                return new TransactionOptions();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<TransactionOptions> parser = PARSER;
                if (parser == null) {
                    synchronized (TransactionOptions.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
