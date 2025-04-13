package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
class CrossProcessLock {

    /* renamed from: a */
    public final FileChannel f23127a;

    /* renamed from: b */
    public final FileLock f23128b;

    public CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.f23127a = fileChannel;
        this.f23128b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.installations.CrossProcessLock m12557a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2d java.lang.Error -> L2f java.io.IOException -> L31
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            com.google.firebase.installations.CrossProcessLock r1 = new com.google.firebase.installations.CrossProcessLock     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L35
        L21:
            r1 = move-exception
            goto L35
        L23:
            r1 = move-exception
            goto L35
        L25:
            r5 = move-exception
            goto L2a
        L27:
            r5 = move-exception
            goto L2a
        L29:
            r5 = move-exception
        L2a:
            r1 = r5
            r5 = r0
            goto L35
        L2d:
            r4 = move-exception
            goto L32
        L2f:
            r4 = move-exception
            goto L32
        L31:
            r4 = move-exception
        L32:
            r1 = r4
            r4 = r0
            r5 = r4
        L35:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L43
            r5.release()     // Catch: java.io.IOException -> L42
            goto L43
        L42:
        L43:
            if (r4 == 0) goto L48
            r4.close()     // Catch: java.io.IOException -> L48
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.CrossProcessLock.m12557a(android.content.Context, java.lang.String):com.google.firebase.installations.CrossProcessLock");
    }

    /* renamed from: b */
    public void m12558b() {
        try {
            this.f23128b.release();
            this.f23127a.close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }
}
