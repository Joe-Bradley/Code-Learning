# mac

### 查看隐藏文件夹

```shell
defaults 3 write com.apple.finder AppleShowAllFiles -boolean true ; killall Finder
defaults 3 write com.apple.finder AppleShowAllFiles -boolean false ; killall Finder
```

