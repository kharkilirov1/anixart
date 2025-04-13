package com.swiftsoft.anixartd.utils.filepicker.model;

import java.util.Locale;

/* loaded from: classes2.dex */
public class FileListItem implements Comparable<FileListItem> {

    /* renamed from: b */
    public String f30500b;

    /* renamed from: c */
    public String f30501c;

    /* renamed from: d */
    public boolean f30502d;

    /* renamed from: e */
    public boolean f30503e;

    /* renamed from: f */
    public long f30504f;

    @Override // java.lang.Comparable
    public int compareTo(FileListItem fileListItem) {
        FileListItem fileListItem2 = fileListItem;
        boolean z = fileListItem2.f30502d;
        return (z && this.f30502d) ? this.f30500b.toLowerCase().compareTo(fileListItem2.f30500b.toLowerCase(Locale.getDefault())) : (z || this.f30502d) ? (!z || this.f30502d) ? -1 : 1 : this.f30500b.toLowerCase().compareTo(fileListItem2.f30500b.toLowerCase(Locale.getDefault()));
    }
}
