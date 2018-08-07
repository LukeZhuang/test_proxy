import time
import tensorflow as tf
import numpy as np

x=tf.placeholder(dtype=tf.float32,shape=[None,3])
y=tf.layers.dense(x,units=2)

with tf.Session() as sess:
	tf.global_variables_initializer().run()
	b=sess.run(y,feed_dict={x:np.random.randn(10,3)})
	print(time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time())),b.shape)