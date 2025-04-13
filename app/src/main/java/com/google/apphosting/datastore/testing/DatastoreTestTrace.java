package com.google.apphosting.datastore.testing;

import com.google.firestore.p012v1.BatchGetDocumentsRequest;
import com.google.firestore.p012v1.BatchGetDocumentsResponse;
import com.google.firestore.p012v1.BeginTransactionRequest;
import com.google.firestore.p012v1.BeginTransactionResponse;
import com.google.firestore.p012v1.CommitRequest;
import com.google.firestore.p012v1.CommitResponse;
import com.google.firestore.p012v1.CreateDocumentRequest;
import com.google.firestore.p012v1.DeleteDocumentRequest;
import com.google.firestore.p012v1.Document;
import com.google.firestore.p012v1.GetDocumentRequest;
import com.google.firestore.p012v1.ListCollectionIdsRequest;
import com.google.firestore.p012v1.ListCollectionIdsResponse;
import com.google.firestore.p012v1.ListDocumentsRequest;
import com.google.firestore.p012v1.ListDocumentsResponse;
import com.google.firestore.p012v1.ListenRequest;
import com.google.firestore.p012v1.ListenResponse;
import com.google.firestore.p012v1.RollbackRequest;
import com.google.firestore.p012v1.RunQueryRequest;
import com.google.firestore.p012v1.RunQueryResponse;
import com.google.firestore.p012v1.UpdateDocumentRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class DatastoreTestTrace {

    /* renamed from: com.google.apphosting.datastore.testing.DatastoreTestTrace$1 */
    public static /* synthetic */ class C15441 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20456a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20456a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20456a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20456a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20456a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20456a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20456a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20456a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class DatastoreAction extends GeneratedMessageLite<DatastoreAction, Builder> implements DatastoreActionOrBuilder {
        public static final int ACTION_ID_FIELD_NUMBER = 200;
        private static final DatastoreAction DEFAULT_INSTANCE;
        public static final int FIRESTORE_V1_ACTION_FIELD_NUMBER = 3;
        private static volatile Parser<DatastoreAction> PARSER = null;
        public static final int VALIDATION_RULE_FIELD_NUMBER = 201;
        private int actionCase_ = 0;
        private int actionId_;
        private Object action_;
        private ValidationRule validationRule_;

        public enum ActionCase {
            /* JADX INFO: Fake field, exist only in values array */
            FIRESTORE_V1_ACTION(3),
            /* JADX INFO: Fake field, exist only in values array */
            ACTION_NOT_SET(0);

            ActionCase(int i2) {
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DatastoreAction, Builder> implements DatastoreActionOrBuilder {
            public Builder() {
                super(DatastoreAction.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(DatastoreAction.DEFAULT_INSTANCE);
            }
        }

        static {
            DatastoreAction datastoreAction = new DatastoreAction();
            DEFAULT_INSTANCE = datastoreAction;
            GeneratedMessageLite.m13417F(DatastoreAction.class, datastoreAction);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0003É\u0003\u0000\u0000\u0000\u0003<\u0000È\u0004É\t", new Object[]{"action_", "actionCase_", FirestoreV1Action.class, "actionId_", "validationRule_"});
                case NEW_MUTABLE_INSTANCE:
                    return new DatastoreAction();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<DatastoreAction> parser = PARSER;
                    if (parser == null) {
                        synchronized (DatastoreAction.class) {
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

    public interface DatastoreActionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FirestoreV1Action extends GeneratedMessageLite<FirestoreV1Action, Builder> implements FirestoreV1ActionOrBuilder {
        public static final int BATCH_GET_DOCUMENTS_FIELD_NUMBER = 10;
        public static final int BEGIN_TRANSACTION_FIELD_NUMBER = 6;
        public static final int COMMIT_FIELD_NUMBER = 7;
        public static final int CREATE_DOCUMENT_FIELD_NUMBER = 3;
        public static final int DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER = 202;
        private static final FirestoreV1Action DEFAULT_INSTANCE;
        public static final int DELETE_DOCUMENT_FIELD_NUMBER = 5;
        public static final int GET_DOCUMENT_FIELD_NUMBER = 1;
        public static final int LISTEN_FIELD_NUMBER = 12;
        public static final int LIST_COLLECTION_IDS_FIELD_NUMBER = 9;
        public static final int LIST_DOCUMENTS_FIELD_NUMBER = 2;
        public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 203;
        private static volatile Parser<FirestoreV1Action> PARSER = null;
        public static final int REMOVE_LISTEN_FIELD_NUMBER = 13;
        public static final int ROLLBACK_FIELD_NUMBER = 8;
        public static final int RUN_QUERY_FIELD_NUMBER = 11;
        public static final int STATUS_FIELD_NUMBER = 201;
        public static final int UPDATE_DOCUMENT_FIELD_NUMBER = 4;
        private Object action_;
        private RunQuery databaseContentsBeforeAction_;
        private StatusProto status_;
        private int actionCase_ = 0;
        private Internal.ProtobufList<MatchingDocuments> matchingDocuments_ = GeneratedMessageLite.m13422t();

        public enum ActionCase {
            /* JADX INFO: Fake field, exist only in values array */
            GET_DOCUMENT(1),
            /* JADX INFO: Fake field, exist only in values array */
            LIST_DOCUMENTS(2),
            /* JADX INFO: Fake field, exist only in values array */
            CREATE_DOCUMENT(3),
            /* JADX INFO: Fake field, exist only in values array */
            UPDATE_DOCUMENT(4),
            /* JADX INFO: Fake field, exist only in values array */
            DELETE_DOCUMENT(5),
            /* JADX INFO: Fake field, exist only in values array */
            BEGIN_TRANSACTION(6),
            /* JADX INFO: Fake field, exist only in values array */
            COMMIT(7),
            /* JADX INFO: Fake field, exist only in values array */
            ROLLBACK(8),
            /* JADX INFO: Fake field, exist only in values array */
            LIST_COLLECTION_IDS(9),
            /* JADX INFO: Fake field, exist only in values array */
            BATCH_GET_DOCUMENTS(10),
            /* JADX INFO: Fake field, exist only in values array */
            RUN_QUERY(11),
            /* JADX INFO: Fake field, exist only in values array */
            LISTEN(12),
            /* JADX INFO: Fake field, exist only in values array */
            REMOVE_LISTEN(13),
            /* JADX INFO: Fake field, exist only in values array */
            ACTION_NOT_SET(0);

            ActionCase(int i2) {
            }
        }

        public static final class BatchGetDocuments extends GeneratedMessageLite<BatchGetDocuments, Builder> implements BatchGetDocumentsOrBuilder {
            private static final BatchGetDocuments DEFAULT_INSTANCE;
            private static volatile Parser<BatchGetDocuments> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private BatchGetDocumentsRequest request_;
            private Internal.ProtobufList<BatchGetDocumentsResponse> response_ = GeneratedMessageLite.m13422t();

            public static final class Builder extends GeneratedMessageLite.Builder<BatchGetDocuments, Builder> implements BatchGetDocumentsOrBuilder {
                public Builder() {
                    super(BatchGetDocuments.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(BatchGetDocuments.DEFAULT_INSTANCE);
                }
            }

            static {
                BatchGetDocuments batchGetDocuments = new BatchGetDocuments();
                DEFAULT_INSTANCE = batchGetDocuments;
                GeneratedMessageLite.m13417F(BatchGetDocuments.class, batchGetDocuments);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"request_", "response_", BatchGetDocumentsResponse.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new BatchGetDocuments();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<BatchGetDocuments> parser = PARSER;
                        if (parser == null) {
                            synchronized (BatchGetDocuments.class) {
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

        public interface BatchGetDocumentsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class BeginTransaction extends GeneratedMessageLite<BeginTransaction, Builder> implements BeginTransactionOrBuilder {
            private static final BeginTransaction DEFAULT_INSTANCE;
            private static volatile Parser<BeginTransaction> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private BeginTransactionRequest request_;
            private BeginTransactionResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<BeginTransaction, Builder> implements BeginTransactionOrBuilder {
                public Builder() {
                    super(BeginTransaction.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(BeginTransaction.DEFAULT_INSTANCE);
                }
            }

            static {
                BeginTransaction beginTransaction = new BeginTransaction();
                DEFAULT_INSTANCE = beginTransaction;
                GeneratedMessageLite.m13417F(BeginTransaction.class, beginTransaction);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new BeginTransaction();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<BeginTransaction> parser = PARSER;
                        if (parser == null) {
                            synchronized (BeginTransaction.class) {
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

        public interface BeginTransactionOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FirestoreV1Action, Builder> implements FirestoreV1ActionOrBuilder {
            public Builder() {
                super(FirestoreV1Action.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(FirestoreV1Action.DEFAULT_INSTANCE);
            }
        }

        public static final class Commit extends GeneratedMessageLite<Commit, Builder> implements CommitOrBuilder {
            private static final Commit DEFAULT_INSTANCE;
            private static volatile Parser<Commit> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private CommitRequest request_;
            private CommitResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<Commit, Builder> implements CommitOrBuilder {
                public Builder() {
                    super(Commit.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(Commit.DEFAULT_INSTANCE);
                }
            }

            static {
                Commit commit = new Commit();
                DEFAULT_INSTANCE = commit;
                GeneratedMessageLite.m13417F(Commit.class, commit);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new Commit();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Commit> parser = PARSER;
                        if (parser == null) {
                            synchronized (Commit.class) {
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

        public interface CommitOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class CreateDocument extends GeneratedMessageLite<CreateDocument, Builder> implements CreateDocumentOrBuilder {
            private static final CreateDocument DEFAULT_INSTANCE;
            private static volatile Parser<CreateDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private CreateDocumentRequest request_;
            private Document response_;

            public static final class Builder extends GeneratedMessageLite.Builder<CreateDocument, Builder> implements CreateDocumentOrBuilder {
                public Builder() {
                    super(CreateDocument.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(CreateDocument.DEFAULT_INSTANCE);
                }
            }

            static {
                CreateDocument createDocument = new CreateDocument();
                DEFAULT_INSTANCE = createDocument;
                GeneratedMessageLite.m13417F(CreateDocument.class, createDocument);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new CreateDocument();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<CreateDocument> parser = PARSER;
                        if (parser == null) {
                            synchronized (CreateDocument.class) {
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

        public interface CreateDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class DeleteDocument extends GeneratedMessageLite<DeleteDocument, Builder> implements DeleteDocumentOrBuilder {
            private static final DeleteDocument DEFAULT_INSTANCE;
            private static volatile Parser<DeleteDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private DeleteDocumentRequest request_;
            private Empty response_;

            public static final class Builder extends GeneratedMessageLite.Builder<DeleteDocument, Builder> implements DeleteDocumentOrBuilder {
                public Builder() {
                    super(DeleteDocument.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(DeleteDocument.DEFAULT_INSTANCE);
                }
            }

            static {
                DeleteDocument deleteDocument = new DeleteDocument();
                DEFAULT_INSTANCE = deleteDocument;
                GeneratedMessageLite.m13417F(DeleteDocument.class, deleteDocument);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new DeleteDocument();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<DeleteDocument> parser = PARSER;
                        if (parser == null) {
                            synchronized (DeleteDocument.class) {
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

        public interface DeleteDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class GetDocument extends GeneratedMessageLite<GetDocument, Builder> implements GetDocumentOrBuilder {
            private static final GetDocument DEFAULT_INSTANCE;
            private static volatile Parser<GetDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private GetDocumentRequest request_;
            private Document response_;

            public static final class Builder extends GeneratedMessageLite.Builder<GetDocument, Builder> implements GetDocumentOrBuilder {
                public Builder() {
                    super(GetDocument.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(GetDocument.DEFAULT_INSTANCE);
                }
            }

            static {
                GetDocument getDocument = new GetDocument();
                DEFAULT_INSTANCE = getDocument;
                GeneratedMessageLite.m13417F(GetDocument.class, getDocument);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new GetDocument();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<GetDocument> parser = PARSER;
                        if (parser == null) {
                            synchronized (GetDocument.class) {
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

        public interface GetDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class ListCollectionIds extends GeneratedMessageLite<ListCollectionIds, Builder> implements ListCollectionIdsOrBuilder {
            private static final ListCollectionIds DEFAULT_INSTANCE;
            private static volatile Parser<ListCollectionIds> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private ListCollectionIdsRequest request_;
            private ListCollectionIdsResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<ListCollectionIds, Builder> implements ListCollectionIdsOrBuilder {
                public Builder() {
                    super(ListCollectionIds.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(ListCollectionIds.DEFAULT_INSTANCE);
                }
            }

            static {
                ListCollectionIds listCollectionIds = new ListCollectionIds();
                DEFAULT_INSTANCE = listCollectionIds;
                GeneratedMessageLite.m13417F(ListCollectionIds.class, listCollectionIds);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new ListCollectionIds();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<ListCollectionIds> parser = PARSER;
                        if (parser == null) {
                            synchronized (ListCollectionIds.class) {
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

        public interface ListCollectionIdsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class ListDocuments extends GeneratedMessageLite<ListDocuments, Builder> implements ListDocumentsOrBuilder {
            private static final ListDocuments DEFAULT_INSTANCE;
            private static volatile Parser<ListDocuments> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private ListDocumentsRequest request_;
            private ListDocumentsResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<ListDocuments, Builder> implements ListDocumentsOrBuilder {
                public Builder() {
                    super(ListDocuments.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(ListDocuments.DEFAULT_INSTANCE);
                }
            }

            static {
                ListDocuments listDocuments = new ListDocuments();
                DEFAULT_INSTANCE = listDocuments;
                GeneratedMessageLite.m13417F(ListDocuments.class, listDocuments);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new ListDocuments();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<ListDocuments> parser = PARSER;
                        if (parser == null) {
                            synchronized (ListDocuments.class) {
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

        public interface ListDocumentsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Listen extends GeneratedMessageLite<Listen, Builder> implements ListenOrBuilder {
            private static final Listen DEFAULT_INSTANCE;
            private static volatile Parser<Listen> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private ListenRequest request_;
            private ListenResponse response_;

            public static final class Builder extends GeneratedMessageLite.Builder<Listen, Builder> implements ListenOrBuilder {
                public Builder() {
                    super(Listen.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(Listen.DEFAULT_INSTANCE);
                }
            }

            static {
                Listen listen = new Listen();
                DEFAULT_INSTANCE = listen;
                GeneratedMessageLite.m13417F(Listen.class, listen);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new Listen();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Listen> parser = PARSER;
                        if (parser == null) {
                            synchronized (Listen.class) {
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

        public interface ListenOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class MatchingDocuments extends GeneratedMessageLite<MatchingDocuments, Builder> implements MatchingDocumentsOrBuilder {
            private static final MatchingDocuments DEFAULT_INSTANCE;
            public static final int LISTEN_RESPONSE_FIELD_NUMBER = 1;
            public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 2;
            private static volatile Parser<MatchingDocuments> PARSER;
            private ListenResponse listenResponse_;
            private RunQueryResponse matchingDocuments_;

            public static final class Builder extends GeneratedMessageLite.Builder<MatchingDocuments, Builder> implements MatchingDocumentsOrBuilder {
                public Builder() {
                    super(MatchingDocuments.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(MatchingDocuments.DEFAULT_INSTANCE);
                }
            }

            static {
                MatchingDocuments matchingDocuments = new MatchingDocuments();
                DEFAULT_INSTANCE = matchingDocuments;
                GeneratedMessageLite.m13417F(MatchingDocuments.class, matchingDocuments);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"listenResponse_", "matchingDocuments_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new MatchingDocuments();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<MatchingDocuments> parser = PARSER;
                        if (parser == null) {
                            synchronized (MatchingDocuments.class) {
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

        public interface MatchingDocumentsOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class RemoveListen extends GeneratedMessageLite<RemoveListen, Builder> implements RemoveListenOrBuilder {
            private static final RemoveListen DEFAULT_INSTANCE;
            private static volatile Parser<RemoveListen> PARSER = null;
            public static final int TARGET_ID_FIELD_NUMBER = 1;
            private int targetId_;

            public static final class Builder extends GeneratedMessageLite.Builder<RemoveListen, Builder> implements RemoveListenOrBuilder {
                public Builder() {
                    super(RemoveListen.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(RemoveListen.DEFAULT_INSTANCE);
                }
            }

            static {
                RemoveListen removeListen = new RemoveListen();
                DEFAULT_INSTANCE = removeListen;
                GeneratedMessageLite.m13417F(RemoveListen.class, removeListen);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"targetId_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new RemoveListen();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<RemoveListen> parser = PARSER;
                        if (parser == null) {
                            synchronized (RemoveListen.class) {
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

        public interface RemoveListenOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Rollback extends GeneratedMessageLite<Rollback, Builder> implements RollbackOrBuilder {
            private static final Rollback DEFAULT_INSTANCE;
            private static volatile Parser<Rollback> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private RollbackRequest request_;
            private Empty response_;

            public static final class Builder extends GeneratedMessageLite.Builder<Rollback, Builder> implements RollbackOrBuilder {
                public Builder() {
                    super(Rollback.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(Rollback.DEFAULT_INSTANCE);
                }
            }

            static {
                Rollback rollback = new Rollback();
                DEFAULT_INSTANCE = rollback;
                GeneratedMessageLite.m13417F(Rollback.class, rollback);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new Rollback();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Rollback> parser = PARSER;
                        if (parser == null) {
                            synchronized (Rollback.class) {
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

        public interface RollbackOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class RunQuery extends GeneratedMessageLite<RunQuery, Builder> implements RunQueryOrBuilder {
            private static final RunQuery DEFAULT_INSTANCE;
            private static volatile Parser<RunQuery> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private RunQueryRequest request_;
            private Internal.ProtobufList<RunQueryResponse> response_ = GeneratedMessageLite.m13422t();

            public static final class Builder extends GeneratedMessageLite.Builder<RunQuery, Builder> implements RunQueryOrBuilder {
                public Builder() {
                    super(RunQuery.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(RunQuery.DEFAULT_INSTANCE);
                }
            }

            static {
                RunQuery runQuery = new RunQuery();
                DEFAULT_INSTANCE = runQuery;
                GeneratedMessageLite.m13417F(RunQuery.class, runQuery);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"request_", "response_", RunQueryResponse.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new RunQuery();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<RunQuery> parser = PARSER;
                        if (parser == null) {
                            synchronized (RunQuery.class) {
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

        public interface RunQueryOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class UpdateDocument extends GeneratedMessageLite<UpdateDocument, Builder> implements UpdateDocumentOrBuilder {
            private static final UpdateDocument DEFAULT_INSTANCE;
            private static volatile Parser<UpdateDocument> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private UpdateDocumentRequest request_;
            private Document response_;

            public static final class Builder extends GeneratedMessageLite.Builder<UpdateDocument, Builder> implements UpdateDocumentOrBuilder {
                public Builder() {
                    super(UpdateDocument.DEFAULT_INSTANCE);
                }

                public Builder(C15441 c15441) {
                    super(UpdateDocument.DEFAULT_INSTANCE);
                }
            }

            static {
                UpdateDocument updateDocument = new UpdateDocument();
                DEFAULT_INSTANCE = updateDocument;
                GeneratedMessageLite.m13417F(UpdateDocument.class, updateDocument);
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
                        return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"request_", "response_"});
                    case NEW_MUTABLE_INSTANCE:
                        return new UpdateDocument();
                    case NEW_BUILDER:
                        return new Builder(null);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<UpdateDocument> parser = PARSER;
                        if (parser == null) {
                            synchronized (UpdateDocument.class) {
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

        public interface UpdateDocumentOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            FirestoreV1Action firestoreV1Action = new FirestoreV1Action();
            DEFAULT_INSTANCE = firestoreV1Action;
            GeneratedMessageLite.m13417F(FirestoreV1Action.class, firestoreV1Action);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u0001Ë\u0010\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000É\tÊ\tË\u001b", new Object[]{"action_", "actionCase_", GetDocument.class, ListDocuments.class, CreateDocument.class, UpdateDocument.class, DeleteDocument.class, BeginTransaction.class, Commit.class, Rollback.class, ListCollectionIds.class, BatchGetDocuments.class, RunQuery.class, Listen.class, RemoveListen.class, "status_", "databaseContentsBeforeAction_", "matchingDocuments_", MatchingDocuments.class});
                case NEW_MUTABLE_INSTANCE:
                    return new FirestoreV1Action();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FirestoreV1Action> parser = PARSER;
                    if (parser == null) {
                        synchronized (FirestoreV1Action.class) {
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

    public interface FirestoreV1ActionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ParallelTestTrace extends GeneratedMessageLite<ParallelTestTrace, Builder> implements ParallelTestTraceOrBuilder {
        private static final ParallelTestTrace DEFAULT_INSTANCE;
        private static volatile Parser<ParallelTestTrace> PARSER = null;
        public static final int TEST_TRACE_FIELD_NUMBER = 1;
        private TestTrace testTrace_;

        public static final class Builder extends GeneratedMessageLite.Builder<ParallelTestTrace, Builder> implements ParallelTestTraceOrBuilder {
            public Builder() {
                super(ParallelTestTrace.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(ParallelTestTrace.DEFAULT_INSTANCE);
            }
        }

        static {
            ParallelTestTrace parallelTestTrace = new ParallelTestTrace();
            DEFAULT_INSTANCE = parallelTestTrace;
            GeneratedMessageLite.m13417F(ParallelTestTrace.class, parallelTestTrace);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"testTrace_"});
                case NEW_MUTABLE_INSTANCE:
                    return new ParallelTestTrace();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ParallelTestTrace> parser = PARSER;
                    if (parser == null) {
                        synchronized (ParallelTestTrace.class) {
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

    public interface ParallelTestTraceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StatusProto extends GeneratedMessageLite<StatusProto, Builder> implements StatusProtoOrBuilder {
        public static final int CANONICAL_CODE_FIELD_NUMBER = 6;
        public static final int CODE_FIELD_NUMBER = 1;
        private static final StatusProto DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        private static volatile Parser<StatusProto> PARSER = null;
        public static final int SPACE_FIELD_NUMBER = 2;
        private int canonicalCode_;
        private int code_;
        private String space_ = "";
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<StatusProto, Builder> implements StatusProtoOrBuilder {
            public Builder() {
                super(StatusProto.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(StatusProto.DEFAULT_INSTANCE);
            }
        }

        static {
            StatusProto statusProto = new StatusProto();
            DEFAULT_INSTANCE = statusProto;
            GeneratedMessageLite.m13417F(StatusProto.class, statusProto);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0006\u0004", new Object[]{"code_", "space_", "message_", "canonicalCode_"});
                case NEW_MUTABLE_INSTANCE:
                    return new StatusProto();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<StatusProto> parser = PARSER;
                    if (parser == null) {
                        synchronized (StatusProto.class) {
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

    public interface StatusProtoOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class TestTrace extends GeneratedMessageLite<TestTrace, Builder> implements TestTraceOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final TestTrace DEFAULT_INSTANCE;
        private static volatile Parser<TestTrace> PARSER = null;
        public static final int TRACE_DESCRIPTION_FIELD_NUMBER = 3;
        public static final int TRACE_ID_FIELD_NUMBER = 1;
        private String traceId_ = "";
        private Internal.ProtobufList<DatastoreAction> action_ = GeneratedMessageLite.m13422t();
        private String traceDescription_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<TestTrace, Builder> implements TestTraceOrBuilder {
            public Builder() {
                super(TestTrace.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(TestTrace.DEFAULT_INSTANCE);
            }
        }

        static {
            TestTrace testTrace = new TestTrace();
            DEFAULT_INSTANCE = testTrace;
            GeneratedMessageLite.m13417F(TestTrace.class, testTrace);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"traceId_", "action_", DatastoreAction.class, "traceDescription_"});
                case NEW_MUTABLE_INSTANCE:
                    return new TestTrace();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TestTrace> parser = PARSER;
                    if (parser == null) {
                        synchronized (TestTrace.class) {
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

    public interface TestTraceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class TimelineTestTrace extends GeneratedMessageLite<TimelineTestTrace, Builder> implements TimelineTestTraceOrBuilder {
        private static final TimelineTestTrace DEFAULT_INSTANCE;
        private static volatile Parser<TimelineTestTrace> PARSER = null;
        public static final int TEST_TRACE_FIELD_NUMBER = 1;
        private TestTrace testTrace_;

        public static final class Builder extends GeneratedMessageLite.Builder<TimelineTestTrace, Builder> implements TimelineTestTraceOrBuilder {
            public Builder() {
                super(TimelineTestTrace.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(TimelineTestTrace.DEFAULT_INSTANCE);
            }
        }

        static {
            TimelineTestTrace timelineTestTrace = new TimelineTestTrace();
            DEFAULT_INSTANCE = timelineTestTrace;
            GeneratedMessageLite.m13417F(TimelineTestTrace.class, timelineTestTrace);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"testTrace_"});
                case NEW_MUTABLE_INSTANCE:
                    return new TimelineTestTrace();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TimelineTestTrace> parser = PARSER;
                    if (parser == null) {
                        synchronized (TimelineTestTrace.class) {
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

    public interface TimelineTestTraceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValidationRule extends GeneratedMessageLite<ValidationRule, Builder> implements ValidationRuleOrBuilder {
        private static final ValidationRule DEFAULT_INSTANCE;
        private static volatile Parser<ValidationRule> PARSER = null;
        public static final int VALIDATE_QUERY_INDEXES_FIELD_NUMBER = 2;
        public static final int VALIDATE_QUERY_RESULT_ORDER_FIELD_NUMBER = 1;
        private boolean validateQueryIndexes_;
        private boolean validateQueryResultOrder_;

        public static final class Builder extends GeneratedMessageLite.Builder<ValidationRule, Builder> implements ValidationRuleOrBuilder {
            public Builder() {
                super(ValidationRule.DEFAULT_INSTANCE);
            }

            public Builder(C15441 c15441) {
                super(ValidationRule.DEFAULT_INSTANCE);
            }
        }

        static {
            ValidationRule validationRule = new ValidationRule();
            DEFAULT_INSTANCE = validationRule;
            GeneratedMessageLite.m13417F(ValidationRule.class, validationRule);
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
                    return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"validateQueryResultOrder_", "validateQueryIndexes_"});
                case NEW_MUTABLE_INSTANCE:
                    return new ValidationRule();
                case NEW_BUILDER:
                    return new Builder(null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ValidationRule> parser = PARSER;
                    if (parser == null) {
                        synchronized (ValidationRule.class) {
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

    public interface ValidationRuleOrBuilder extends MessageLiteOrBuilder {
    }
}
