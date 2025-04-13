package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import com.google.protobuf.ByteString;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class SQLiteMutationQueue implements MutationQueue {

    public static class BlobAccumulator implements Consumer<Cursor> {

        /* renamed from: a */
        public final ArrayList<ByteString> f22809a;

        /* renamed from: b */
        public boolean f22810b;

        @Override // com.google.firebase.firestore.util.Consumer
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            ByteString byteString = ByteString.f23981c;
            this.f22809a.add(ByteString.m13151g(blob, 0, blob.length));
            if (blob.length < 1000000) {
                this.f22810b = false;
            }
        }
    }
}
