package com.google.firebase.firestore.local;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.firestore.local.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2105e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22836b;

    /* renamed from: c */
    public final /* synthetic */ SQLiteSchema f22837c;

    public /* synthetic */ RunnableC2105e(SQLiteSchema sQLiteSchema, int i2) {
        this.f22836b = i2;
        this.f22837c = sQLiteSchema;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22836b) {
            case 0:
                SQLiteSchema sQLiteSchema = this.f22837c;
                sQLiteSchema.f22815a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                sQLiteSchema.f22815a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                sQLiteSchema.f22815a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                sQLiteSchema.f22815a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                break;
            case 1:
                SQLiteSchema sQLiteSchema2 = this.f22837c;
                sQLiteSchema2.f22815a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                sQLiteSchema2.f22815a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                break;
            case 2:
                SQLiteSchema sQLiteSchema3 = this.f22837c;
                sQLiteSchema3.f22815a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                sQLiteSchema3.f22815a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                sQLiteSchema3.f22815a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                sQLiteSchema3.f22815a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                sQLiteSchema3.f22815a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                break;
            case 3:
                this.f22837c.f22815a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                break;
            case 4:
                this.f22837c.f22815a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                break;
            case 5:
                SQLiteSchema sQLiteSchema4 = this.f22837c;
                sQLiteSchema4.f22815a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                sQLiteSchema4.f22815a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                sQLiteSchema4.f22815a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                break;
            case 6:
                SQLiteSchema sQLiteSchema5 = this.f22837c;
                sQLiteSchema5.f22815a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                sQLiteSchema5.f22815a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                sQLiteSchema5.f22815a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                break;
            default:
                this.f22837c.f22815a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                break;
        }
    }
}
