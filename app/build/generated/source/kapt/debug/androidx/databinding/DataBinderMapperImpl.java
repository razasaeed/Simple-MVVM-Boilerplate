package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new global.cloud.storage.DataBinderMapperImpl());
  }
}
