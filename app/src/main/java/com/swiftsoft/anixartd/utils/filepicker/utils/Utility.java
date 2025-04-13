package com.swiftsoft.anixartd.utils.filepicker.utils;

import android.content.Context;
import android.os.Build;
import com.swiftsoft.anixartd.utils.filepicker.model.FileListItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class Utility {
    /* renamed from: a */
    public static boolean m16462a(Context context) {
        return Build.VERSION.SDK_INT < 23 || context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    public static ArrayList<FileListItem> m16463b(ArrayList<FileListItem> arrayList, File file, ExtensionFilter extensionFilter) {
        try {
            for (File file2 : file.listFiles(extensionFilter)) {
                if (file2.canRead()) {
                    FileListItem fileListItem = new FileListItem();
                    fileListItem.f30500b = file2.getName();
                    fileListItem.f30502d = file2.isDirectory();
                    fileListItem.f30501c = file2.getAbsolutePath();
                    fileListItem.f30504f = file2.lastModified();
                    arrayList.add(fileListItem);
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return new ArrayList<>();
        }
    }
}
