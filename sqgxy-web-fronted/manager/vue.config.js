const { defineConfig } = require('@vue/cli-service')

module.exports = defineConfig({
  transpileDependencies: true,
  chainWebpack: config => {
    config.plugin('define').tap(definitions => {
        Object.assign(definitions[0]['process.env'], {
          //NODE_HOST: '"http://180.76.56.118:8888"',
            NODE_HOST: '"http://127.0.0.1:8888"',
        });
        return definitions;
    });
  }
})
