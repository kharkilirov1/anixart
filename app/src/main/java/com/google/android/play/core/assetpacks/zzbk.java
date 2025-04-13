package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbk extends com.google.android.play.core.internal.zzcm {

    /* renamed from: b */
    public final NavigableMap<Long, File> f19749b = new TreeMap();

    public zzbk(File file, File file2) throws IOException {
        ArrayList arrayList = (ArrayList) zzep.m10813a(file, file2);
        if (arrayList.isEmpty()) {
            throw new zzck(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        Iterator it = arrayList.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            File file3 = (File) it.next();
            this.f19749b.put(Long.valueOf(j2), file3);
            j2 += file3.length();
        }
    }

    @Override // com.google.android.play.core.internal.zzcm
    /* renamed from: a */
    public final long mo10749a() {
        Map.Entry<Long, File> lastEntry = this.f19749b.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey().longValue();
    }

    @Override // com.google.android.play.core.internal.zzcm
    /* renamed from: b */
    public final InputStream mo10750b(long j2, long j3) throws IOException {
        if (j2 < 0 || j3 < 0) {
            throw new zzck(String.format("Invalid input parameters %s, %s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j4 = j2 + j3;
        if (j4 > mo10749a()) {
            throw new zzck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo10749a()), Long.valueOf(j4)));
        }
        Long floorKey = this.f19749b.floorKey(Long.valueOf(j2));
        Long floorKey2 = this.f19749b.floorKey(Long.valueOf(j4));
        if (floorKey.equals(floorKey2)) {
            return new zzbj(m10751c(j2, floorKey), j3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m10751c(j2, floorKey));
        Collection<File> values = this.f19749b.subMap(floorKey, false, floorKey2, false).values();
        if (!values.isEmpty()) {
            arrayList.add(new zzdr(Collections.enumeration(values)));
        }
        arrayList.add(new zzbj(new FileInputStream((File) this.f19749b.get(floorKey2)), j3 - (floorKey2.longValue() - j2)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    /* renamed from: c */
    public final InputStream m10751c(long j2, Long l2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f19749b.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            return fileInputStream;
        }
        throw new zzck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
